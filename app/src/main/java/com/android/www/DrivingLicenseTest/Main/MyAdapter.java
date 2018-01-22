package com.android.www.DrivingLicenseTest.Main;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.android.www.DrivingLicenseTest.R;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ashokumarshrestha on 3/19/17.
 */



    class MyAdapter extends BaseExpandableListAdapter {
        private Context ctx;
        private HashMap<String, List<String>> ChildTitles;
        private List<String> HeaderTitles;

        MyAdapter(Context ctx, HashMap<String, List<String>> ChildTitles, List<String> HeaderTitles) {
            this.ctx = ctx;
            this.ChildTitles = ChildTitles;
            this.HeaderTitles = HeaderTitles;
        }

        @Override
        public int getGroupCount() {
            return HeaderTitles.size();
        }

        @Override
        public int getChildrenCount(int i) {
            return ChildTitles.get(HeaderTitles.get(i)).size();
        }

        @Override
        public Object getGroup(int i) {
            return HeaderTitles.get(i);
        }

        @Override
        public Object getChild(int i, int i1) {
            return ChildTitles.get(HeaderTitles.get(i)).get(i1);
        }

        @Override
        public long getGroupId(int i) {
            return i;
        }

        @Override
        public long getChildId(int i, int i1) {
            return i;
        }

        @Override
        public boolean hasStableIds() {
            return false;
        }

        @Override
        public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
            String title = (String) this.getGroup(i);
            if (view == null) {
                LayoutInflater inflater = (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.custom_header, null);
            }
            TextView txt = (TextView) view.findViewById(R.id.idTitle);
            txt.setTypeface(null, Typeface.BOLD);
            txt.setText(title);
            return view;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            String title = (String) this.getChild(i, i1);
            if (view == null) {
                LayoutInflater inflater = (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.custom_childitems, null);
            }
            TextView txt = (TextView) view.findViewById(R.id.idChild);
            txt.setText(title);
            return view;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }
    }

