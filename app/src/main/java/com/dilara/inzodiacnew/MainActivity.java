package com.dilara.inzodiacnew;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.AppBarConfiguration.Builder;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private MenuItem cikis;
    private AppBarConfiguration mAppBarConfiguration;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        this.mAppBarConfiguration = new Builder(R.id.fragment_burclar, R.id.burc_ogrenFragment,
                R.id.gezegenFragment, R.id.evlerFragment,
                R.id.hakkimdaFragment).setDrawerLayout((DrawerLayout) findViewById(R.id.drawer_layout)).build();
        NavController findNavController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController((AppCompatActivity) this, findNavController,
                this.mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, findNavController);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.cikis) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(Navigation.findNavController(this, R.id.nav_host_fragment),
                this.mAppBarConfiguration) || super.onSupportNavigateUp();
    }
}