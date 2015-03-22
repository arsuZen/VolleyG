package done.it.get.volleyg.utility;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by asu on 3/22/15.
 * For singleton.
 */
public class VolleyInstance {

    private static VolleyInstance mInstance;
    private static Context mCtx;

    private RequestQueue mRequestQueue;

    private VolleyInstance(Context context){
        mCtx = context;
        mRequestQueue = getRequestQueue();
    }

    public static synchronized VolleyInstance getInstance(Context context){
        if(mInstance == null){
            mInstance = new VolleyInstance(context);
        }
        return  mInstance;
    }
    private RequestQueue getRequestQueue(){
        if(mRequestQueue == null){
            // getApplicationContext() is key, it keeps you from leaking the
            // Activity or BroadcastReceiver if someone passes one in.
            mRequestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return mRequestQueue;
    }

    public <MyRequestType> void addToRequestQueue(Request<MyRequestType> request){
        getRequestQueue().add(request);
    }

    public <TagType> void cancelByTag(TagType type){
        getRequestQueue().cancelAll(type);
    }

}
