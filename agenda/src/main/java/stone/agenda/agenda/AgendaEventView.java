package stone.agenda.agenda;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import stone.agenda.R;

/**
 * List item view for the StickyHeaderListView of the agenda view
 */
public class AgendaEventView extends LinearLayout {
    public static AgendaEventView inflate(ViewGroup parent) {
        return (AgendaEventView) LayoutInflater.from(parent.getContext()).inflate(R.layout.view_agenda_event, parent, false);
    }

    public AgendaEventView(Context context) {
        this(context, null);
    }

    public AgendaEventView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AgendaEventView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setPadding(getResources().getDimensionPixelSize(R.dimen.agenda_event_view_padding_left),
                getResources().getDimensionPixelSize(R.dimen.agenda_event_view_padding_top),
                getResources().getDimensionPixelSize(R.dimen.agenda_event_view_padding_right),
                getResources().getDimensionPixelSize(R.dimen.agenda_event_view_padding_bottom));
    }
}