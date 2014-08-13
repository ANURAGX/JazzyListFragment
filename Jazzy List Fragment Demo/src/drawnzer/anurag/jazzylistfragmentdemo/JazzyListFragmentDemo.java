/**
 * Copyright(c) 2014 DRAWNZER.ORG PROJECTS -> ANURAG
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *      
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *                             
 *                             anurag.dev1512@gmail.com
 *
 */

package drawnzer.anurag.jazzylistfragmentdemo;

import drawnzer.anurag.jazzylistfragment.JazzyListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.ArrayAdapter;

/**
 * 
 * @author ANURAG
 *
 */
public class JazzyListFragmentDemo extends FragmentActivity{
	
	static String strings[];
	ViewPager mViewPager;
	FragmentSection adapter;
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.main_demo);
		mViewPager = (ViewPager)findViewById(R.id.pager);
			
		strings = new String[60];
		//GENERATING THE STRINGS FOR LIST ADAPTER....
		for(int i=0;i<60;++i)
			strings[i] = "     List Item Number -> "+i+1;
		
		adapter = new FragmentSection(getSupportFragmentManager());
		mViewPager.setAdapter(adapter);
	}

	/**
	 * 
	 * 
	 * @author ANURAG
	 *
	 */
	static class FragmentSection extends FragmentStatePagerAdapter{

		public FragmentSection(FragmentManager fm) {
			super(fm);
			// TODO Auto-generated constructor stub
		}
		@Override
		public Fragment getItem(int position) {
			// TODO Auto-generated method stub
			if(position == 0){
				return new ListFragmentOne();
			}	
			else{
				return new ListFragmentTwo();
			}	
		}
				
		@Override
		public CharSequence getPageTitle(int position) {
			// TODO Auto-generated method stub
			if(position==0)
				return "ListFragmentOne";
			else
				return "ListFragmentTwo";
		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 2;
		}		
	}
	
	
	/*
	 * FRAGMENT CLASS FOR FRAGMENT SECTION....
	 */
	static class ListFragmentOne extends JazzyListFragment{
		public ListFragmentOne() {
			/**
			 * 
			 * @param animStyle
			 * 
			 *  STANDARD = 0;
		     *  GROW = 1;
		     *  CARDS = 2;
		     *  CURL = 11;
		     *  WAVE = 8;
		     *  FLIP = 5;
		     *  FLY = 6;
		     *  REVERSE_FLY = 7;
		     *  HELIX = 4;
		     *  FAN = 9;
		     *  TILT = 10;
		     *  ZIPPER = 3;
		     *  FADE = 12;
		     *  TWIRL = 13;
		     *  SLIDE_IN = 14;
			 */
			super(3);
			// TODO Auto-generated constructor stub
		}
		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			getListView();
			setListAdapter(new ArrayAdapter<String>(getActivity(),
					android.R.layout.simple_list_item_1, strings));
		}
	}
	
	/*
	 * FRAGMENT CLASS FOR FRAGMENT SECTION....
	 */
	static class ListFragmentTwo extends JazzyListFragment{
		public ListFragmentTwo() {
			/**
			 * 
			 * @param animStyle
			 * 
			 *  STANDARD = 0;
		     *  GROW = 1;
		     *  CARDS = 2;
		     *  CURL = 11;
		     *  WAVE = 8;
		     *  FLIP = 5;
		     *  FLY = 6;
		     *  REVERSE_FLY = 7;
		     *  HELIX = 4;
		     *  FAN = 9;
		     *  TILT = 10;
		     *  ZIPPER = 3;
		     *  FADE = 12;
		     *  TWIRL = 13;
		     *  SLIDE_IN = 14;
			 */
			super(5);
			// TODO Auto-generated constructor stub			
		}
		
		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onActivityCreated(savedInstanceState);
			getListView();
			setListAdapter(new ArrayAdapter<String>(getActivity(),
					android.R.layout.simple_list_item_1, strings));
		}		
	}
}
