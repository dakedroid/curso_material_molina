package mx.tecnm.voaxaca.curso_material_molina.ui.chats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import mx.tecnm.voaxaca.curso_material_molina.R
import mx.tecnm.voaxaca.curso_material_molina.databinding.ItemChatFragmentBinding

class ItemChatFragment : Fragment() {

    lateinit var binding: ItemChatFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.item_chat_fragment, container, false)
        return binding.root
    }


}