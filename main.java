import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a TextView to display the app name
        TextView textView = new TextView(this);
        textView.setText("Your App Name"); // Replace "Your App Name" with your desired app name
        textView.setTextSize(24);
        textView.setGravity(Gravity.CENTER);

        // Set the TextView as the main content view of the activity
        setContentView(textView, new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
    }
}
