# Struts 1.1 DA Patch

We have forked the tags/STRUTS_1_1 as 1.1-da-patch branch.

We patched Struts-1.1 as following:
1. Vulnerability
2. OutOfMemory for huge upload files
3. Expanded upload file size limit from int to long
4. Load properties files as UTF-8 (get rid of native2ascii)

The last patch breaks the compatibility against original Struts 1.1.

2019/09/19
