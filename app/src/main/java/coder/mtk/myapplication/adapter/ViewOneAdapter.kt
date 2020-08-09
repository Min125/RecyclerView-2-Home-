package coder.mtk.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import coder.mtk.myapplication.R
import coder.mtk.myapplication.model.ViewOne
import kotlinx.android.synthetic.main.item_itemone.view.*
import androidx.core.graphics.drawable.toDrawable

class ViewOneAdapter(var viewOneList: ArrayList<ViewOne>) :
    RecyclerView.Adapter<ViewOneAdapter.ViewOneViewHolder>() {
    class ViewOneViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(viewone: ViewOne) {
            itemView.itemOneImage.setBackgroundResource(viewone.imgSrc)
            itemView.itemOneName.text = viewone.itemName
            itemView.itemOneDescription.text = viewone.ItemDescription
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewOneViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_itemone, parent, false)
        return ViewOneViewHolder(view)
    }

    override fun getItemCount(): Int {
        return viewOneList.size
    }

    override fun onBindViewHolder(holder: ViewOneViewHolder, position: Int) {
        holder.bind(viewOneList[position])
    }
}