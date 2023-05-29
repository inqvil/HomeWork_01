fun <T> checkExecutionTime(action: () -> T): Long {
    val startTime = System.currentTimeMillis()
    action.invoke()
    return System.currentTimeMillis() - startTime
}

