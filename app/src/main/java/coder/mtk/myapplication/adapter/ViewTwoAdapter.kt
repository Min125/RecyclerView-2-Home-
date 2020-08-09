package coder.mtk.myapplication.ad

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coder.mtk.myapplication.R
import coder.mtk.myapplication.model.ViewTwo
import kotlinx.android.synthetic.main.item_itemtwo.view.*

class ViewTwoAdapter (var viewTwoList : ArrayList<ViewTwo>) : RecyclerView.Adapter<ViewTwoAdapter.ViewTwoHolder>(){
    class ViewTwoHolder (itemView : View) : RecyclerView.ViewHolder (itemView) {
        fun bind(viewTwo : ViewTwo) {
            itemView.itemTwoImage.setImageResource(viewTwo.imageSrc)
            itemView.itemTwoName.text = viewTwo.name
            itemView.itemTwoBrand.text = viewTwo.brand
            itemView.itemTwoPrice.text = viewTwo.price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewTwoHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_itemtwo,parent,false)
        return ViewTwoHolder(view)
    }

    override fun getItemCount(): Int {
        return viewTwoList.size
    }

    override fun onBindViewHolder(holder: ViewTwoHolder, position: Int) {
        holder.bind(viewTwoList[position])
    }
}