package com.example.restraunt.domain

import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

object Constant {
    val supabase = createSupabaseClient(
        supabaseUrl = "https://huyiplusnxjsdrxoyvov.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imh1eWlwbHVzbnhqc2RyeG95dm92Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NDA5OTc5NzIsImV4cCI6MjA1NjU3Mzk3Mn0.5Sm8ILoJ6wOKo7heJ_bqKgbzS9oVO_wo6HK6sc1w218"
    ) {
        install(Postgrest)
        install(Auth)
    }
}