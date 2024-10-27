package iterator.iterators;

import iterator.profile.Profile;

/**
 * プロフィール・インターフェースを定義
 */
public interface ProfileIterator {
    boolean 
    hasNext();

    Profile getNext();

    void reset();
    
} 