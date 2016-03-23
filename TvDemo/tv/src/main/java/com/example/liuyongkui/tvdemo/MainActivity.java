/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.example.liuyongkui.tvdemo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/*
 * MainActivity class that loads MainFragment
 */
public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* ViewGroup fg = (ViewGroup) getLayoutInflater().inflate(R.layout.activity_main, null);

       view = new MyTestView(this);

       fg.addView(new MyTestView(this));
       this.addContentView(fg, null);*/

       // setContentView(root);
      setContentView(R.layout.activity_main);

      //  view = findViewById(R.id.mytestView);
    }

    public void onResquuseLayout(){

       view.invalidate();
    }

    public void onInvlidate(){
      view.requestLayout();
    }

}
