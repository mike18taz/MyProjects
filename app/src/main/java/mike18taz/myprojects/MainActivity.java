package mike18taz.myprojects;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import mike18taz.myprojects.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements ItemFragmentProjects.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Opening Project", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
                openProject();

            }
        });
    }



        public void openProject() {
            Intent intent = new Intent(this, ProjectDetailActivity.class);
            intent.setAction(Intent.ACTION_MAIN);
            int requestCode = 1;

            startActivityForResult(intent, requestCode);
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        //android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        //actionBar.hide();


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_hide) {
            android.support.v7.app.ActionBar actionBar = getSupportActionBar();
            actionBar.hide();
        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
