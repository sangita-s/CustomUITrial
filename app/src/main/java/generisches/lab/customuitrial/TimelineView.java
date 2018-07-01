package generisches.lab.customuitrial;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baoyachi.stepview.VerticalStepView;

import java.util.ArrayList;
import java.util.List;

public class TimelineView extends AppCompatActivity {

    VerticalStepView mVerticalStepView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline_view);

        mVerticalStepView = (VerticalStepView) findViewById(R.id.verticalStepView);

        //source
        List<String> sources = new ArrayList<>();
        sources.add("Start");
        sources.add("Design");
        sources.add("Code");
        sources.add("Test");
        sources.add("Maintenance");
        sources.add("Release");

        mVerticalStepView.setStepsViewIndicatorComplectingPosition(sources.size() - 3)
        .reverseDraw(false)
        .setStepViewTexts(sources)
        .setLinePaddingProportion(0.85f)
        .setStepViewComplectedTextColor(Color.parseColor("#eeeeee"))
        .setStepViewUnComplectedTextColor(ContextCompat.getColor(TimelineView.this, R.color.uncompleted_text_color))
        .setStepsViewIndicatorCompletedLineColor(Color.parseColor("#eeeeee"))
        .setStepsViewIndicatorUnCompletedLineColor(Color.parseColor("#FFFFFF"))
        .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(TimelineView.this,R.drawable.complted))
        .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(TimelineView.this, R.drawable.attention))
        .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(TimelineView.this, R.drawable.default_icon));
        ;
    }
}
