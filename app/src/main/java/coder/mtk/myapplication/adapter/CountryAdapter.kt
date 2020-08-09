package coder.mtk.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coder.mtk.myapplication.R
import coder.mtk.myapplication.model.Country
import kotlinx.android.synthetic.main.item_itemthree.view.*

class CountryAdapter (var countryList : ArrayList<Country>) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>(){
    class CountryViewHolder (itemView : View) : RecyclerView.ViewHolder (itemView){
        fun bind(country : Country){
            itemView.countryName.text = country.countryName
            itemView.countryPhoto.setBackgroundResource(country.imageSrc)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_itemthree,parent,false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  countryList.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countryList[position])
    }
}