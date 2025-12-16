package com.sunbeam.quiz.model;

import java.time.LocalDateTime;

public class Attempt {
	public int id;
	public int quizId;
	public int studentId;
	public int score;
	public int total;
	public LocalDateTime attemptTime;

}
