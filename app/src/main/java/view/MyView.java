package view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/**
 * Created by Edwin on 2017/3/17.
 */

public class MyView extends ImageView {

    int     bitmap_W;//图片的宽
    int     bitmap_H; //图片的高
    int     start_Top;
    int     start_Left;
    int     start_Bottom;
    int     start_Right;
    Context context;

    private Animation scaleAnimation  = null;
    private Animation roTateAnimation = null;


    public MyView(Context context) {
        super(context);
        this.context = context;
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        bitmap_W = getMeasuredWidth();
        bitmap_H = getMeasuredHeight();

    }

    @Override
    public void layout(int l, int t, int r, int b) {
        super.layout(l, t, r, b);              //图片相对于手机的位置


        start_Left = l;   //左
        start_Right = r;   //右

        start_Top = t;     //上
        start_Bottom = b;   //下


    }

    /*protected void onLayout(boolean changed, int left, int top, int right,
                            int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (start_Top == -1) {
            start_Top = top;
            start_Left = left;
            start_Bottom = bottom;
            start_Right = right;
        }
    }
*/

    public boolean onTouchEvent(MotionEvent event) {
        /** 处理触摸事件**/
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:

                onTouchDown(event);
                break;

            default:
                break;
        }

        return true;
    }


    //手指按下的操作
    private void onTouchDown(MotionEvent event) {
        int currentX = (int) event.getRawX(); //当前x坐标
        int currentY = (int) event.getRawY();  //当前y坐标

        if(currentX-start_Left < bitmap_W/3  ){   //左边区域

            //播放旋转动画
            roTateAnimation = new RotateAnimation(0, 30,
                    RotateAnimation.RESTART, bitmap_W,
                    RotateAnimation.RESTART,0 );
            roTateAnimation.setDuration(500);

           // roTateAnimation.setFillAfter(true);

            startAnimation(roTateAnimation);
            return;

        }



       /* if(currentX-start_Left > 2*bitmap_W/3 ){   //右边边区域

            roTateAnimation = new RotateAnimation(0,30,Animation.RELATIVE_TO_SELF,0,Animation.RELATIVE_TO_SELF,0);
            roTateAnimation.setDuration(500);
            roTateAnimation.setFillAfter(true);
            startAnimation(roTateAnimation);
            return;


        }  //*/


      /*  if(){                             //下边区域




        }
*/

        /*//播放缩放动画
        scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

        scaleAnimation.setFillAfter(true);

        //设置动画时间
        scaleAnimation.setDuration(500);
        this.startAnimation(scaleAnimation);*/


    }


}
