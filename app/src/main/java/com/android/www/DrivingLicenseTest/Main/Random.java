package com.android.www.DrivingLicenseTest.Main;

import android.app.Activity;
import android.os.Bundle;
        import android.widget.ExpandableListView;

import com.android.www.DrivingLicenseTest.R;

import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;

public class Random extends Activity {
    HashMap<String,List<String>> myHeader ;
    List<String> myChild;
    ExpandableListView expList;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randomquestion);
        expList = (ExpandableListView) findViewById(R.id.idListView);
        myHeader= DataProvider.getInfo();
        myChild = new ArrayList<String>(myHeader.keySet());
        adapter = new MyAdapter(this,myHeader,myChild);
        expList.setAdapter(adapter);
    }
}
