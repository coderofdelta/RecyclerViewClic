package com.laurentdarl.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.laurentdarl.recyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), OnschoolItemClickListner {

    private lateinit var binding: ActivityMainBinding
    private lateinit var schoolAdapter: SchoolAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var maureen = listOf<Student>(
            Student(R.drawable.ic_jane_jully, "", "Grace"),
            Student(R.drawable.ic_womans, "Faith", "prt"),
            Student(R.drawable.ic_mary_jay, "Grace", "Olee"),
            Student(R.drawable.ic_jenny_kim, "Glory", "Jamee"),
            Student(R.drawable.ic_pink_white, "Grace", "Ogo"),
            Student(R.drawable.ic_kenny_molo, "Matta", "Doe"),
            Student(R.drawable.ic_woman5, "Mofo", "Ongo"),
            Student(R.drawable.ic_jane_jully, "Reen", "Onnome"),
            Student(R.drawable.ic_womans, "Men", "sga"),
            Student(R.drawable.ic_sarah_bill, "Dolln", "Sha"),
            Student(R.drawable.ic_womans2, "Sden", "Sha"),
            Student(R.drawable.ic_pat_mike, "Madn", "Tags"),
            Student(R.drawable.ic_womans4, "Maun", "Tama"),
            Student(R.drawable.ic_woman5, "Aurn", "Gore"),
            Student(R.drawable.ic_jane_jully, "Maureen", "Ago"),
            Student(R.drawable.ic_womans, "Mary", "Onos"),
            Student(R.drawable.ic_isioma_kella, "Kate", "Maga"),
            Student(R.drawable.ic_womans2, "Edith", "Onomo"),
            Student(R.drawable.ic_womans3, "Pete", "Foo"),
            Student(R.drawable.ic_womans4, "Mat", "Pete"),
            Student(R.drawable.ic_woman5, "Mill", "Matt"),
            Student(R.drawable.ic_jane_jully, "Mooni", "Still"),
            Student(R.drawable.ic_womans, "Jane", "Nanh"),
            Student(R.drawable.ic_womans1, "Oni", "Onogo"),
            Student(R.drawable.ic_womans2, "Ma", "Kate"),
            Student(R.drawable.ic_womans3, "Glory", "Mons"),
            Student(R.drawable.ic_womans4, "Kate", "nors"),
            Student(R.drawable.ic_woman5, "Moo", "Oe")
        )

        schoolAdapter = SchoolAdapter(maureen, this)
        binding.Text.adapter = schoolAdapter

    }

    override fun onItemClick(student: Student, position: Int) {
        val intent = Intent(this,ProfileActivity::class.java)
        intent.putExtra("ProfileView", student.images.toString())
        intent.putExtra("firstName", student.name)
        intent.putExtra("lastName", student.lastName)
        startActivity(intent)

    }
}