#!/bin/bash

# killall -9 dingodb_server

mydir="${BASH_SOURCE%/*}"
if [[ ! -d "$mydir" ]]; then mydir="$PWD"; fi
. $mydir/shflags

DEFINE_string role 'store' 'server role'

# parse the command-line
FLAGS "$@" || exit 1
eval set -- "${FLAGS_ARGV}"

echo "role: ${FLAGS_role}"

user=`whoami`
process_no=`ps -fu ${user} | grep dingodb_server | grep ${FLAGS_role} | grep -v grep | awk '{print $2}' | xargs`

if [ "$process_no" != "" ]; then
  echo "pid to kill: ${process_no}"
  kill -9 $process_no
else
  echo "not exist ${FLAGS_role} process"
fi
