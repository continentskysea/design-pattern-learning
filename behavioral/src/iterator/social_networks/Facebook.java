package iterator.social_networks;

import iterator.iterators.FacebookIterator;
import iterator.iterators.ProfileIterator;
import iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;



/**
 * Facebook
 */
public class Facebook implements SocialNetwork {
    private List<Profile> profiles;
    
    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    public Profile requestProfileFromFacebook(String profileEmail) {
        simulateNetwrokLatency();
        System.out.println("Facebook Loading profile '" + profileEmail + "' over the network...");

        return findProfile(profileEmail);
    }

    public List<String> requestprofileFriendsFromFacebook(String profileEmail, String contactType) {
        simulateNetwrokLatency();
        System.out.println("Facebook: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        Profile profile = findProfile(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findProfile(String profileEmail) {
        for (Profile profile : profiles) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetwrokLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmali) {
        return new FacebookIterator(this, "friends", profileEmali);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }

}
