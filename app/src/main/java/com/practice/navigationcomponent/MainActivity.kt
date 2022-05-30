package com.practice.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.*
import com.practice.navigationcomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navCotroller: NavController;
    private lateinit var binding: ActivityMainBinding;
    private lateinit var appBarConfiguration: AppBarConfiguration;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.host_fragment) as NavHostFragment
        navCotroller = navHostFragment.findNavController()
        setSupportActionBar(binding.toolBar)
        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.homeFragment, R.id.searchFragment),
            binding.drawerLayout
        )
        setupActionBarWithNavController(navCotroller, appBarConfiguration)
        binding.bottomnav.setupWithNavController(navCotroller)
        binding.drawer.setupWithNavController(navCotroller)


    }

    // fragment ki id aur option menu ki id same honi chaheyay
    override fun onSupportNavigateUp(): Boolean {
        return navCotroller.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.termsandCondtion) {
            val action = NavGraphDirections.actionGlobalTermAndCondtion()
            navCotroller.navigate(action)
            return true
        } else {
            return item.onNavDestinationSelected(navCotroller) || super.onOptionsItemSelected(item)

        }
    }

}