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

package drawnzer.anurag.jazzylistfragment;

import com.twotoasters.jazzylistview.JazzyHelper;
import android.support.v4.app.ListFragment;
import android.widget.ListView;

/**
 * THIS LIBRARY LETS PROGRAMMERS TO USE JAZZY LIST VIEW IN LIST FRAGMENTS....
 * THIS LIBRARY USES JAZZY LIST VIEW LIBRARY AS ITS BASE.. 
 * 
 * @author ANURAG
 *
 */
public class JazzyListFragment extends ListFragment{
	int anim;
	
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
	public JazzyListFragment(int animStyle) {
		// TODO Auto-generated constructor stub
		anim = animStyle;
		
	}
	
	@Override
	public ListView getListView() {
		// TODO Auto-generated method stub
		ListView lv = super.getListView(); 
		JazzyHelper help = new JazzyHelper(getActivity(), null);
		help.setTransitionEffect(anim);
		lv.setOnScrollListener(help);
		return lv;
	}
	
}
