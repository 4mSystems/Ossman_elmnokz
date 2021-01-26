package apps.app.altcompany.pages.settings.models;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class SuggestionsRequest {
    @SerializedName("suggestions_title")
    private String suggestions_title;
    @SerializedName("suggestions_text")
    private String suggestions_text;

    public boolean isValid() {
    return (!TextUtils.isEmpty(suggestions_text)&& !TextUtils.isEmpty(suggestions_title));
    }

    public String getSuggestions_title() {
        return suggestions_title;
    }

    public void setSuggestions_title(String suggestions_title) {
        this.suggestions_title = suggestions_title;
    }

    public String getSuggestions_text() {
        return suggestions_text;
    }

    public void setSuggestions_text(String suggestions_text) {
        this.suggestions_text = suggestions_text;
    }
}
