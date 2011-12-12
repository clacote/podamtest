package models;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import uk.co.jemos.podam.annotations.PodamExclude;

/**
 * An URL shared by a member on his profile
 * @author Sryl <cyril.lacote@gmail.com>
 */
public class SharedLink {

    public int ordernum;

    public String name;

    public String URL;

    @PodamExclude
    public Member member;

    public SharedLink(String name, String URL) {
        this.name = name;
        this.URL = URL;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SharedLink other = (SharedLink) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return new EqualsBuilder()
                .append(this.name, other.name)
                .append(this.URL, other.URL)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.name)
                .append(this.URL)
                .toHashCode();
    }

    /**
     * WARNING : used in UI to display a link in {@link SharedLinkActivity}
     * @return 
     */
    @Override
    public String toString() {
        return name;
    }
}
