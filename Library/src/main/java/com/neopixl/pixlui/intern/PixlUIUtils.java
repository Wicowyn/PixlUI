package com.neopixl.pixlui.intern;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.neopixl.pixlui.components.textview.FontFactory;

import static com.neopixl.pixlui.intern.PixlUIConstants.ATTR_TEXT_ALL_CAPS;
import static com.neopixl.pixlui.intern.PixlUIConstants.ATTR_TYPEFACE_NAME;
import static com.neopixl.pixlui.intern.PixlUIConstants.SCHEMA_URL;

/**
 * Created by mwolfe on 6/11/14.
 */
public class PixlUIUtils {

    public static boolean containsUppercaseStyleOrAttribute(Context ctx, int[] attrs, int uppercaseId, AttributeSet attributeSet, int defStyle) {
        int len = attributeSet.getAttributeCount();

        for (int i=0; i<len;i++) {
            String name = attributeSet.getAttributeName(i);
            if (name.equals(ATTR_TEXT_ALL_CAPS)) {
                boolean value = attributeSet.getAttributeBooleanValue(i, false);
                return value;
            }
        }

        TypedArray a = ctx.obtainStyledAttributes(attributeSet, attrs, defStyle, 0);
        int id=a.getResourceId(uppercaseId, 0);
        boolean isUppercase;

        if(id==0){
            isUppercase = a.getBoolean(uppercaseId, false);
        }
        else{
            isUppercase = ctx.getResources().getBoolean(id);
        }

        a.recycle();

        return isUppercase;
    }

    public static void setCustomFont(Context ctx, TextView view, int[] attrs, int typefaceId, AttributeSet set, int defStyle) {
        String typefaceName = set.getAttributeValue(SCHEMA_URL, ATTR_TYPEFACE_NAME);

        if (typefaceName == null) {
            TypedArray a = ctx.obtainStyledAttributes(set, attrs, defStyle, 0);

            int id = a.getResourceId(typefaceId, 0);
            if(id==0){
                typefaceName = a.getString(typefaceId);
            }
            else{
                typefaceName = ctx.getString(id);
            }

            a.recycle();
        }

        if(typefaceName != null) {
            Typeface tf = FontFactory.getInstance(ctx).getFont(typefaceName);

            if (tf != null) {
                view.setPaintFlags(view.getPaintFlags() | Paint.SUBPIXEL_TEXT_FLAG | Paint.LINEAR_TEXT_FLAG);
                view.setTypeface(tf);
            }
        }
    }
}
