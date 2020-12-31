package com.apptokoko.app.ui.book

import android.content.Context
import android.content.Intent
import androidx.databinding.ViewDataBinding
import com.apptokoko.app.R
import com.apptokoko.app.data.model.Book
import com.apptokoko.app.databinding.ItemBookBinding
import com.apptokoko.app.ui.base.BaseAdapter
import com.bumptech.glide.Glide

class BookAdapter(val context: Context) : BaseAdapter<Book>(R.layout.item_book) {
    override fun onBind(binding: ViewDataBinding?, data: Book) {
        val mBinding = binding as ItemBookBinding
        Glide.with(context).load(data.poster).into(mBinding.itemPoster)
    }

    override fun onClick(binding: ViewDataBinding?, data: Book) {
        val intent = Intent(context, BookActivity::class.java)
        intent.putExtra(BookActivity.OPEN_BOOK, data)
        context.startActivity(intent)
    }
}