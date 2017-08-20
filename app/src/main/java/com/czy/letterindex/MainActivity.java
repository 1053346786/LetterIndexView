package com.czy.letterindex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者：叶应是叶
 * 时间：2017/8/20 11:46
 * 描述：
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv_contactsList = (ListView) findViewById(R.id.lv_contactsList);
        LetterIndexView liv_letters = (LetterIndexView) findViewById(R.id.liv_letters);
        TextView tv_hint = (TextView) findViewById(R.id.tv_hint);
        lv_contactsList.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, getData()));
        Map<String, Integer> letterMap = new HashMap<>();
        letterMap.put("A", 0);
        letterMap.put("B", 3);
        letterMap.put("C", 7);
        letterMap.put("F", 10);
        letterMap.put("I", 13);
        letterMap.put("K", 16);
        letterMap.put("L", 19);
        letterMap.put("M", 20);
        letterMap.put("N", 22);
        letterMap.put("S", 23);
        letterMap.put("T", 25);
        letterMap.put("X", 28);
        new IndexControl(lv_contactsList, liv_letters, tv_hint, letterMap);
    }

    private List<String> getData() {
        List<String> data = new ArrayList<>();
        data.add("abc");
        data.add("aabc");
        data.add("aabc");
        data.add("babc");
        data.add("b");
        data.add("bc");
        data.add("babc");
        data.add("cabc");
        data.add("cabc");
        data.add("cabc");
        data.add("fabc");
        data.add("fabc");
        data.add("fabc");
        data.add("iabc");
        data.add("i");
        data.add("ic");
        data.add("kabc");
        data.add("kabc");
        data.add("kabc");
        data.add("leavesC");
        data.add("mabc");
        data.add("mabc");
        data.add("nabc");
        data.add("sabc");
        data.add("sabc");
        data.add("tabc");
        data.add("tabc");
        data.add("tabc");
        data.add("xabc");
        data.add("xabc");
        data.add("xabc");
        return data;
    }

}
