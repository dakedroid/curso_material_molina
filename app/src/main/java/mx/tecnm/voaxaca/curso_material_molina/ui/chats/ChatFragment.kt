package mx.tecnm.voaxaca.curso_material_molina.ui.chats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import mx.tecnm.voaxaca.curso_material_molina.R
import mx.tecnm.voaxaca.curso_material_molina.databinding.ChatFragmentBinding
import mx.tecnm.voaxaca.curso_material_molina.ui.home.HomeFragmentDirections


class ChatFragment : Fragment() {

    lateinit var binding: ChatFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.chat_fragment, container, false)


        binding.msg1.root.setOnClickListener {

            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToItemChatFragment())
        }

        return binding.root
    }

}