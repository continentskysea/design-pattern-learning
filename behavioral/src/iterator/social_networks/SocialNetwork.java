package iterator.social_networks;

import iterator.iterators.ProfileIterator;

/**
 * 共通ソーシャル・ネットワーク・インターフェースを定義
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
