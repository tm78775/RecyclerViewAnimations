package ke.mush.recyclerviewanimations.fragment;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import ke.mush.recyclerviewanimations.R;
import ke.mush.recyclerviewanimations.model.AnimationItem;

/**
 * Created by mush on 2/9/18.
 */

public class ListDemoFragment extends BaseFragment {

    @Override
    protected int getLayoutResId() {
        return R.layout.frag_list;
    }

    @Override
    protected RecyclerView.Adapter getRecyclerViewAdapter() {
        return new CardAdapter();
    }

    @Override
    protected RecyclerView.LayoutManager getLayoutManager(Context context) {
        return new LinearLayoutManager(context);
    }

    @Override
    protected AnimationItem[] getAnimationItems() {
        return new AnimationItem[]{
                new AnimationItem("Fall down", R.anim.layout_animation_fall_down),
                new AnimationItem("Slide from right", R.anim.layout_animation_from_right),
                new AnimationItem("Slide from bottom", R.anim.layout_animation_from_bottom)

        };
    }
}
