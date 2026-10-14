package org.ldv.myhello.controller

import jakarta.servlet.http.HttpServletRequest
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class exo_01 {
    @GetMapping("/mycommande")
    @ResponseBody
    fun querrysStrin(querry: HttpServletRequest):String{
        val name = querry.getParameter("name")?: ""
        val surname = querry.getParameter("surname")?: ""

        val starter = querry.getParameter("starter")?: ""
        val maincourse = querry.getParameter("maincourse")?: ""
        val desert = querry.getParameter("desert")?: ""
        val drink = querry.getParameter("drink")?: ""

        return "Helloooooooooooooooooooooo evrybody of the world particulary you ${prenom} ${nom}"
    }
}