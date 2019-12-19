package com.jyo.dropboxusercontent.ui.main;

import android.os.Parcel;
import android.os.Parcelable;

public class CardItem implements Parcelable {
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTextTitle() {
        return textTitle;
    }

    public void setTextTitle(String textTitle) {
        this.textTitle = textTitle;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    private int image;
private String textTitle,textDescription;

    protected CardItem(Parcel in) {
        image = in.readInt();
        textTitle = in.readString();
        textDescription = in.readString();
    }

    public static final Creator<CardItem> CREATOR = new Creator<CardItem>() {
        @Override
        public CardItem createFromParcel(Parcel in) {
            return new CardItem(in);
        }

        @Override
        public CardItem[] newArray(int size) {
            return new CardItem[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(textTitle);
        dest.writeString(textDescription);
    }
}
