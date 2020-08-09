package coder.mtk.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import coder.mtk.myapplication.ad.ViewTwoAdapter
import coder.mtk.myapplication.adapter.CountryAdapter
import coder.mtk.myapplication.adapter.ViewOneAdapter
import coder.mtk.myapplication.model.Country
import coder.mtk.myapplication.model.ViewOne
import coder.mtk.myapplication.model.ViewTwo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //View One
        var viewOneList = ArrayList<ViewOne>()
        viewOneList.add(ViewOne(R.drawable.item1photo1,"Camera","New Product from Leica Brand"))
        viewOneList.add(ViewOne(R.drawable.item1photo2,"Iphone 11","New Product from Apple Brand"))
        viewOneList.add(ViewOne(R.drawable.item1photo1,"Camera","New Product from Leica Brand"))

        var viewOneAdapter = ViewOneAdapter(viewOneList)

        itemOneRecycler.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = viewOneAdapter
        }

        //View Two
        var viewTwoList = ArrayList<ViewTwo>()
        viewTwoList.add(ViewTwo(R.drawable.item2photo1,"Hyde Prk N41015","LOUIS VUITTON","500,000"))
        viewTwoList.add(ViewTwo(R.drawable.item2photo2,"Mens Club Fleece Hoodie","Nike","150,000"))
        viewTwoList.add(ViewTwo(R.drawable.item2photo3,"Golf Air Max 1G","Nikee","200,000"))
        viewTwoList.add(ViewTwo(R.drawable.item2photo1,"Hyde Prk N41015","LOUIS VUITTON","500,000"))
        viewTwoList.add(ViewTwo(R.drawable.item2photo2,"Mens Club Fleece Hoodie","Nike","150,000"))

        var viewTwoAdapter = ViewTwoAdapter(viewTwoList)

        itemTwoRecycler.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = viewTwoAdapter
        }

        //View Three
        var countryList = ArrayList <Country>()
        countryList.add(Country(R.drawable.myanmar,"Myanmar"))
        countryList.add(Country(R.drawable.china,"China"))
        countryList.add(Country(R.drawable.japan,"Japan"))
        countryList.add(Country(R.drawable.korea,"Korea"))

        var countryAdapter = CountryAdapter(countryList)
        itemThirdRecycler.apply {
            layoutManager = GridLayoutManager(context,2)
            adapter = countryAdapter
        }
    }
}