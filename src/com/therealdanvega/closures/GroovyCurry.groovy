package com.therealdanvega.closures

class GroovyCurry {


    def static log = { String type, Date createdOn, String msg ->
        println "$createdOn [$type] - $msg"
    }

    def static debugLog = log.curry("DEBBUG")

    def static todayDebugLog = log.curry("DEBUG", new Date())

    //right curry

    def static crazyPersonLog = log.rcurry("Why am I logging this way")

    //index based curry

    def static typeMsgLog = log.ncurry(1, new Date())



    static void main(String[] args) {


        log("DEBUG", new Date(), "this is my first debug statement....")

        debugLog(new Date(), "this is my first debug statement...with curry.")

        todayDebugLog("This is second debbug statement with curry")

        //right curry
        crazyPersonLog("ERROR", new Date())

        //index based curry
        typeMsgLog("INFO", "N param exchanged")

    }


}
