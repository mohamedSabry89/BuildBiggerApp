package com.udacity.gradle.builditbigger;

import android.content.Context;

import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.rules.ActivityScenarioRule;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;


@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mMainActivityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void verifyJoke() {
        onView(withId(R.id.joke_button)).perform(click());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //If Async fails it would return an empty string, if test passes means a joke was fetched with success
        onView(withId(R.id.tv_display_joke)).check(matches(not(withText(""))));
    }


}
