package com.example.demo;


import com.example.demo.model.Person;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(value = Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class JsonTest {

    @Param({"1000", "10000", "10000"})
    private int count;

    private Person p;

    @Benchmark
    public void JsonLib() {
        for (int i = 0;i < count;i++) {

        }
    }

}
