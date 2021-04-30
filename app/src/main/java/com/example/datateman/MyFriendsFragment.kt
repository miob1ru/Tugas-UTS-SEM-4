package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment (){
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(MyFriend("Andika","laki-laki","andikapermana@gmail.com",
            "088147565873","JL.Pratama Rt03 Rw23, Kedungkandang"))
        listTeman.add(
            MyFriend("Surya Indra","laki-laki","suryaoye@gmai.com",
        "081254652558","JL.Diponegoro, Malang")
        )
        listTeman.add(
                MyFriend("Andika Pratama","Laki-Laki","145pratamaputra#@yahoo.com",
                "055452552554","Jl. Panji Suroso, Malang")
        )
    }

    private fun tampilTeman(){
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}