/**
 *  Implementing onClickListener
 */


 /******************************** 1st ********************************/
 /**************** Acitivity implements onClickListener ***************/
/******************************** 2nd *********************************/
public class FooActivity implements OnClickListener {

	Button button;	// this button calls triggers onClickListener

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// your code here

		button.setOnClickListener(this);
	}

	public onClick(View view) {

		// your onClick code here

	}
}

 /******************************** 2nd ********************************/
 /******* Creating a new class which implements onClickListener *******/
 /*********************************************************************/

 public class FooActivity {

	Button button;	// this button calls triggers onClickListener

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// your code here

		button.setOnClickListener(new ImplementerClass());
	} 	

	class ImplementerClass implements OnClickListener {

		public void onClick(View view) {

			// your onClick code here
		}
	}
 }


 /******************************** 3rd ********************************/
 /************************* Just going for it xD **********************/
 /*********************************************************************/
 public class FooActivity {

	Button button;	// this button calls triggers onClickListener

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// your code here

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View view) {
				// your onClick code here		
			}
		});
	}
