package net.geekweavers.podamtest;

import java.util.Set;

/**
 *
 * @author Sryl <cyril.lacote@gmail.com>
 */
public class Member {

    public String str;

    public Set<SharedLink> sharedLinks;

    // Without setter, PODAM generation for sharedLinks attribute doesn't work, even if attribute is public.
    public void setSharedLinks(Set<SharedLink> sharedLinks) {
        this.sharedLinks = sharedLinks;
    }
}
