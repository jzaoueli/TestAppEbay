package com.jihed.testappxml.java;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Jihed on 10.01.2016.
 */
public class SearchResult {

    public final static int RESULT_SUCCESS=0;
    public final static int RESULT_ERROR=1;

    private int resultCode;
    private Exception error;
    private ArrayList<Listing> listings;


    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public Exception getError() {
        return error;
    }

    public void setError(Exception error) {
        this.error = error;
    }

    public ArrayList<Listing> getListings() {
        return listings;
    }

    public void setListings(ArrayList<Listing> listings) {
        this.listings = listings;
    }

    public SearchResult(){
        this.listings=new ArrayList<Listing>();
    }

    public void append(SearchResult toAppend){
        this.listings.addAll(toAppend.getListings());
    }

    public void sort(){
        Collections.sort(this.listings);
    }
}
