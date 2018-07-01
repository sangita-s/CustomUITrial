package generisches.lab.customuitrial;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ProfilePage extends AppCompatActivity {

    private RelativeLayout mRelativeLayout;
    private ImageView mProPicSmall;
    private TextView mNameSmall;
    private TextView mDescSmall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        mRelativeLayout = findViewById(R.id.card_rel_layout);
        mProPicSmall = findViewById(R.id.pro_pic);
        mNameSmall = findViewById(R.id.txt_name);
        mDescSmall = findViewById(R.id.txt_desc);

        mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProfilePage.this, ProfileViewActivity.class);

                Pair[] pairs = new Pair[3];
                pairs[0] = new Pair<View, String> (mProPicSmall, "imageTransition");
                pairs[1] = new Pair<View, String> (mNameSmall, "nameTransition");
                pairs[2] = new Pair<View, String> (mDescSmall, "descTransition");

                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(ProfilePage.this,
                                pairs);

                startActivity(i, options.toBundle());
            }
        });
    }
}
