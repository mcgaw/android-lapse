package mcgaw.spitfire.capture;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.MediumTest;
import android.view.SurfaceView;

import junit.framework.Assert;

import mcgaw.spitfire.R;

/**
 * Created by mcgaw on 29/04/15.
 */
public class PreviewActivityTests extends ActivityUnitTestCase<PreviewActivity> {

    private Intent mLaunchIntent;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mLaunchIntent = new Intent(getInstrumentation()
                .getTargetContext(), PreviewActivity.class);

    }

    public PreviewActivityTests() {
        super(PreviewActivity.class);
    }

    @MediumTest
    public void testPreviewSurfaceShowingCameraOnStart() {

        PreviewActivity activity = startActivity(mLaunchIntent, null, null);

        // Verify the activity has a surface for showing the camera preview
        SurfaceView surface = (SurfaceView) activity.findViewById(R.id.surface_camera);
        Assert.assertNotNull("unable to find camera surface", surface);

    }

    @MediumTest
    public void testStartCaptureButtonLaunchesCaptureActivity() {



    }

}
