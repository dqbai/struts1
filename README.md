# Struts 1.1 DA Patch

We have forked the tags/STRUTS\_1_1 as 1.1-da-patch branch.

We patched Struts-1.1 as following:

- Vulnerability
- OutOfMemory for huge upload files
- Expanded upload file size limit from int to long
- Replaced variable names "enum" to "enm" for Java 1.7 compilation.
- Load properties files as UTF-8 (introduced from jdk1.6, get rid of native2ascii).
  This breaks the compatibility against original Struts 1.1.
- We have built it on eclipse, so .project and .classpath files were created, 
  and also added lib/*.jar for compilation and junit tests, we left these files
  for convenience, but removed them from struts-1.1-da-patch-2-source.jar.
- You can find the source and binary jars under distrib directory. They are build
  by ant at Java 1.7 compile level, via jdk12.

2019/09/21

- Decrease the wait lock via double lock check and ConcurrentHashMap to improve the performance.

2021-08-26
