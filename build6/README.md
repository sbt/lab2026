1. Observe `sbt test`
2. `sbt shutdown`
3. Update to sbt 2.1.0-RC1, and run `sbt test` again to observe the test summary
4. Fix the test by changing src/main/scala/example/A.scala
5. Run `sbt test` a few times to observe incremental test
6. Run `sbt test --cache_test_result=false`
7. `sbt shutdownall`
