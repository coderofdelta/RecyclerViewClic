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
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),
            Student(R.drawable.ic_isioma_kella, "Joy", "Grace"),


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