/**
 * Copyright 2016 alewang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.appium;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by alewang on 4/4/16.
 */
public class ListViewActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listview);

		ListView listView = (ListView) findViewById(R.id.list_view);
		final int numElements = 100;
		ArrayList<String> dataList = new ArrayList<>(numElements);
		for(int i = 0; i < numElements; i++) {
			dataList.add(Integer.toString(i));
		}
		ArrayAdapter<String> simpleAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataList);
		listView.setAdapter(simpleAdapter);
	}
}
