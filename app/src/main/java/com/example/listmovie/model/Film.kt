package com.example.listmovie.model

import android.os.Parcel
import android.os.Parcelable


data class Film (
    var photo: Int,
    var judul: String?,
    var desc:String?,
    var releaseDate: String?,
    var rating:String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(photo)
        parcel.writeString(judul)
        parcel.writeString(desc)
        parcel.writeString(releaseDate)
        parcel.writeString(rating)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Film> {
        override fun createFromParcel(parcel: Parcel): Film {
            return Film(parcel)
        }

        override fun newArray(size: Int): Array<Film?> {
            return arrayOfNulls(size)
        }
    }


}