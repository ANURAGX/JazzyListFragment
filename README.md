### JAZZY LIST FRAGMENT
=====

Ever wanted to have animated list view for LIST FRAGMENTS,but unable to achieve it.
Now here's a simple and smarted way of having Jazzy list view for your list fragments.

Animations Available
--------
There are around 12 different animations available that you can choose for your list fragment
```java

    	       STANDARD = 0;
		       GROW = 1;
		       CARDS = 2;
		       CURL = 11;
		       WAVE = 8;
		       FLIP = 5;
		       FLY = 6;
		       REVERSE_FLY = 7;
		       HELIX = 4;
		       FAN = 9;
		       TILT = 10;
		       ZIPPER = 3;
		       FADE = 12;
		       TWIRL = 13;
		       SLIDE_IN = 14;
		
	
```
You can manually create your own animations and include it in main project.

Library Usage
-----
Include Jazzy List Fragment as a library to your main project and extend your fragment class to JazzyListFragment class.
```java
	public class FragmentClass extends JazzyListFragment{
		/**
			 * 
			 * @param animationStyle
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
	
		public FragmentClass(){
		
			//Pass the above integer values to constutor for the mentioned animation styles...
			super(animationStyle);
		}
		
		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			getListView(); //Get list view must be called to get your animations working....
			//After calling getListView() set your adapter....
			setListAdapter(your_Adapter_Here);
		}
	}
```

###Beautiful Screenshots From File Quest that implemented this Library.... 
<img src="http://s9.postimg.org/exkfopq8f/Untitled.png" width="720px" height="600px"/>
