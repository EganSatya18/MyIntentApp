package www.smktelkommalang.myintentapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
    private String name, email, city;
    private int age;

    protected Person(Parcel in){
        name = in.readString();
        email = in.readString();
        city = in.readString();
        age = in.readInt();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) { return new Person(in); }

        @Override
        public Person[] newArray(int size) { return new Person[size]; }
    };

    public Person(String nama, String email, String city, int age){
        this.name=name;
        this.email=email;
        this.city=city;
        this.age=age;
    }

    public int getAge() {return age; }
    public String getCity() {return city; }
    public String getEmail() {return email; }
    public String getName() {return name; }

    @Override
    public int describeContents() {return 0; }
    @Override
    public void writeToParcel(Parcel parcel, int i){
        parcel.writeString(name);
        parcel.writeString(email);
        parcel.writeString(city);
        parcel.writeInt(age);
    }
    }
