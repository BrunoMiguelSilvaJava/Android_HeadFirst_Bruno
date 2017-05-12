package com.brunosilva.workout;

public class Workout {
    private String name;
    private String description;
    public static final Workout[] workouts = {
            new Workout("Barbara",
                    "5 ROUND 3 MIN REST\n\n20 Pull-ups\n30 Push-ups\n40 Sit-ups\n50 Squats"),
            new Workout("Chelsea",
                    "EMOM FOR 30 MIN\n\n5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Mary",
                    "AMRAP 20 MIN\n\n5 Handstand push-ups\n10 single leg squats\n15 Pull-ups"),
            new Workout("Cindy",
                    "AMRAP 20 MIN\n\n5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Annie",
                    "50 40 30 20 10\n\nDouble unders\nSit-ups"),
            new Workout("Nicole",
                    "AMRAP 20 MIN\n\n400m run\nMax rep pull-ups"),
            new Workout("Angie",
                    "AFAP\n\n100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("Eva",
                    "5 ROUNDS\n\n800m run\n30 Kettlebell swings (32 Kg)\n30 Pull-ups"),
            new Workout("Helen",
                    "3 ROUNDS\n\n400m run\n21 Kettlebell swings (24 Kg)\n12 Pull-ups"),
            new Workout("Kelly",
                    "5 ROUNDS\n\n400m run\n30 Box jumps (60 cm)\n30 Wall balls (9 Kg)"),
            new Workout("Karen",
                    "AFAP\n\n150 Wall balls (9 Kg)"),
            new Workout("Amanda",
                    "9-7-5\n\nMuscle ups\nSnatch (60 Kg)"),
            new Workout("Jackie",
                    "AFAP\n\n1000m row\n50 Thrusters (20 Kg)\n30 Pull-ups"),
            new Workout("Diane",
                    "21-15-9\n\nDeadlift (100 Kg)\nHandstand push-ups"),
            new Workout("Fran",
                    "21-15-9\n\nThrusters (45 Kg)\nPull-ups"),
            new Workout("Elizabeth",
                    "21-15-9\n\nCleans (60 Kg)\nRing Dips"),
            new Workout("Nancy",
                    "5 ROUNDS\n\n400m run\n15 Overhead Squats (45 Kg)"),
            new Workout("Lynne",
                    "5 ROUNDS MAX REPS\n\nBench press (body weight)\nPull-ups"),
            new Workout("Isabel",
                    "AFAP\n\n30 Snacths (60 Kg)"),
            new Workout("Linda",
                    "10/9/8/7/6/5/4/3/2/1\n\nDeadlift (1/2 body weight)\nBench Press (body weight)\nClean (3/4 body weight)"),
            new Workout("Isabel",
                    "AFAP\n\n30 Clean and Jerks (60 Kg)")
    };
    //Each Workout has a name and description
    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return this.name;
    }
}