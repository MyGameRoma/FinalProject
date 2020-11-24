package pages;

import org.assertj.core.api.SoftAssertions;

public class Common {

    SoftAssertions softly = new SoftAssertions();

    public void validate(String that, String equalTo) {
        softly.assertThat(that).isEqualTo(equalTo);
    }


}
