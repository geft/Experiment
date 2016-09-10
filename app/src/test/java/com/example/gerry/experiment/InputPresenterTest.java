package com.example.gerry.experiment;

import android.app.Activity;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import butterknife.ButterKnife;

import static org.assertj.android.api.Assertions.assertThat;

/**
 * Created by Gerry on 10/09/2016.
 */
public class InputPresenterTest {

    InputPresenter presenter;
    Activity activity = Mockito.mock(InputActivity.class);

    public InputPresenterTest() {
    }

    @Before
    public void setUp() throws Exception {
        activity = Mockito.mock(InputActivity.class);
        presenter = new InputPresenter(activity);
    }

    @Test
    public void testSetHelloWorldText() throws Exception {
        String testString = "hahaha";
        TextView textView = ButterKnife.findById(activity, R.id.text_hello_world);

        presenter.setHelloWorldText(testString);
        assertThat(textView).containsText(testString);
        assertThat(textView).doesNotContainText(R.string.input_hello_secret);

        presenter.setHelloWorldText(null);
        assertThat(textView).isEmpty();

        presenter.setHelloWorldText("secret");
        assertThat(textView).containsText(R.string.input_hello_secret);
    }
}